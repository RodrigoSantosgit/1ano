import socket
import time
import csv
import json

def main():

        # Criação do socket
        tcp_client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        tcp_client.bind( ("0.0.0.0", 0) )
        tcp_client.connect(("193.136.92.147", 8080))
        
		# Ligação ao servidor
        dataconect = "CONNECT\n"
        encodeddata = dataconect.encode("utf-8")
        tcp_client.send(encodeddata)
		
		# Receção do token utilizado para comunicar com o Servidor
        recv_token_obj = tcp_client.recv(4096)
        data = recv_token_obj.decode("utf-8")
        print(data)
        token = json.loads(data)
        read_stats = ("READ " + str(token['TOKEN']) + "\n")
        r_stats = read_stats.encode("utf-8")
        tcp_client.send(r_stats)
        
		# Receção do OK do servidor
        json_stats = tcp_client.recv(4096)
        j_stats = json_stats.decode("utf-8")
        print(j_stats)

		# Receção do 1º objeto tipo json com os valores de vento, temperatura e humidade
        tcp_client.recv(4096) 
        stats = tcp_client.recv(4096)
        j_stats = stats.decode("utf-8")
        print(j_stats)
        
        # Guardar os valores de vento, humidade e temperatura do 1º objeto	
        dict_data = json.loads(j_stats)
        wind0 = str(dict_data['WIND'])
        humidity0 = str(dict_data['HUMIDITY'])
        temp0 = str(dict_data['TEMPERATURE'])

        # Registo dos primeiros valores num ficheiro csv
        fout = open("EstadoTempo.csv", "w")
        writer = csv.DictWriter(fout, fieldnames=["Wind", "Temperature", "Humidity"])
        writer.writeheader()
        writer.writerow({"Wind": wind0, "Temperature": temp0, "Humidity": humidity0})
        
		# Receção do 2º objeto tipo json com os valores de vento, temperatura e humidade
        tcp_client.recv(4096) 
        stats = tcp_client.recv(4096)
        j_stats = stats.decode("utf-8")
        print(j_stats)
        
        # Guardar os valores de vento, humidade e temperatura do 1º objeto
        dict_data = json.loads(j_stats)
        wind1 = str(dict_data['WIND'])
        humidity1 = str(dict_data['HUMIDITY'])
        temp1 = str(dict_data['TEMPERATURE'])
		
		# Registo dos segundos valores no ficheiro csv criado anteriormente
        writer.writerow({"Wind": wind1, "Temperature": temp1, "Humidity": humidity1})
        
        # Cálculo da média da temperatura e análise da mesma para aconselhar o utilizador 
        temp = (float(temp0) + float(temp1))/2
        if(temp < 12):
                print("Está frio! Leve roupa quente!")

        elif(temp < 20):
                print("Está agradavel, leve roupa amena.")

        else:
                print("Está calor, leve peças de roupa mais leves!")

		# fecho do client
        tcp_client.close()

main()
