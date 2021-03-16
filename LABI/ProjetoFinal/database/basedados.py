import sqlite3 as sql
import sys



#Tabela samples

def new_samples(dct): #função que adiciona novos excertos à tabela samples
	db = sql.connect('basedados.db')  #conectar à base de dados
	db.execute("Insert into samples(name, length, date, author, bpm, uses) VALUES(?, ?, ?, ?, ?, ?)", (dct["name"], dct["length"], dct["date"], dct["author"], dct["bpm"], 0))
	db.commit()
	db.close() #terminar ligação
	
def delete_sample(name): #função que elimina um sample
	db = sql.connect('basedados.db')  #conectar à base de dados
	db.execute("DELETE FROM samples WHERE name = ?;", (name))
	db.commit()
	db.close() #terminar ligação

def get_sample(name): #função que devolve uma string com todas as informações do sample
	db = sql.connect('basedados.db')  #conectar à base de dados
	result = db.execute("SELECT * FROM samples WHERE name = ?;", (name))
	db.commit()
	row = result.fetchone();
	db.close() #terminar ligação
	return row
	
def add_use_sample(name, use): #Função que adiciona um uso da sample. Tem de ser chamada e referidos o nome do sample e usos na aplicação Web.
	db = sql.connect('basedados.db')  #conectar à base de dados
	result = db.execute("SELECT (uses) FROM samples WHERE name = ?;", (name))
	uses = result.fetchone();
	new_uses = uses + use
	db.execute("UPDATE samples SET uses = ? WHERE name = ?;", (new_uses, name))
	db.commit()
	db.close() #terminar ligação
	
	
#Tabela musics	
	
def new_music(dct): #função que adiciona novas musicas à tabela musics
	db = sql.connect('basedados.db')  #conectar à base de dados
	db.execute("Insert into musics(name, length, date, author, bpm, votes) VALUES(?, ?, ?, ?, ?, ?)", (dct["name"], dct["length"], dct["date"], dct["author"], dct["bpm"], 0))
	db.execute("ALTER TABLE users_votes ADD ? TEXT;", (dct["name"])) #vai criar uma nova coluna na tabela users_votes que corresponde aos votos dos utilizadores nesta musica
	db.commit()
	db.close() #terminar ligação
	
def delete_music(name): #função que elimina uma musica
	db = sql.connect('basedados.db')  #conectar à base de dados
	db.execute("DELETE FROM musics WHERE name = ?;", (name)) 
	db.execute("ALTER TABLE users_votes DROP COLUMN ?;", (name))
	db.commit()
	db.close() #terminar ligação

def get_music(name): #função que devolve uma string com todas as informações da musica
	db = sql.connect('basedados.db')  #conectar à base de dados
	result = db.execute("SELECT * FROM musics WHERE name = ?;", (name))
	db.commit()
	row = result.fetchone();
	db.close() #terminar ligação
	return row
	
def add_vote_music(name_music, name_user, vote): #função que adiciona um voto à musica name_music
	db = sql.connect('basedados.db')  #conectar à base de dados
	result = db.execute("SELECT (votes) FROM musics WHERE name = ?;", (name_music))
	votes = result.fetchone();
	new_votes = votes + vote
	db.execute("UPDATE musics SET votes = ? WHERE name = ?;", (new_votes, name_music))
	db.execute("UPDATE users_votes SET ? = ? WHERE name = ?;", (name_music, vote, name_user))
	db.commit()
	db.close() #terminar ligação
	

#Tabela users_votes

def add_user(name):
	db = sql.connect('basedados.db')  #conectar à base de dados
	result = db.execute("Insert into users_votes(name) VALUES(?)", (name)) #
	db.commit()
	db.close() #terminar ligação

def get_vote(name_user, name_music):
	db = sql.connect('basedados.db')  #conectar à base de dados
	result = db.execute("SELECT (?) FROM users_votes WHERE name = ?;", (name_music, name_user))
	row = result.fetchone();
	db.commit()
	db.close() #terminar ligação
	return row
	
