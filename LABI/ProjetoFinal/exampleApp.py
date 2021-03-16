#!python
# Example of a cherrypy application that serves static content,
# as well as dynamic content.
#
# JMR@ua.pt 2016
#
# To run:
#	python exampleApp.py

import os.path
import cherrypy

import wave
import sys
import pyaudio
player = pyaudio.PyAudio()

# The absolute path to this file's base directory:
baseDir = os.path.dirname(os.path.abspath(__file__))

cherrypy.config.update({'server.socket_port':10009,})
# Dict with the this app's configuration:
config = {
  "/":     { "tools.staticdir.root": baseDir },
  "/js":   { "tools.staticdir.on": True,
             "tools.staticdir.dir": "js" },
  "/css":  { "tools.staticdir.on": True,
             "tools.staticdir.dir": "css" },
  "/html": { "tools.staticdir.on": True,
             "tools.staticdir.dir": "html" },
  "/images": {"tools.staticdir.on": True,
              "tools.staticdir.dir": "images" },
  "/sound": {"tools.staticdir.on": True,
             "tools.staticdir.dir": "sound" },
  "/database": {"tools.staticdir.on": True,
             "tools.staticdir.dir": "database" }, 
}

class Root:

    @cherrypy.expose
    def index(self):
       return open('html/index.html', 'r').read()

    @cherrypy.expose
    def soundboard(self):
       return open('html/soundboard.html', 'r').read()


    @cherrypy.expose
    def grelha(self):
       return open('html/Samples.html', 'r').read()

    @cherrypy.expose
    def claves(self):

       wf = wave.open('sound/claves.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def conga(self):

       wf = wave.open('sound/conga.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def conga2(self):

       wf = wave.open('sound/conga2.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def crash(self):

       wf = wave.open('sound/crash.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def gun(self):

       wf = wave.open('sound/gun.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def hat(self):

       wf = wave.open('sound/hat.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def shaker(self):

       wf = wave.open('sound/shaker.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def stick(self):

       wf = wave.open('sound/stick.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def tom(self):

       wf = wave.open('sound/tom.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def tom2(self):

       wf = wave.open('sound/tom2.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()

    @cherrypy.expose
    def triangle(self):

       wf = wave.open('sound/triangle.wav', 'rb')

       stream = player.open(
       format = player.get_format_from_width(wf.getsampwidth()),
       channels = wf.getnchannels(),
       rate = wf.getframerate(),
       output = True)
       data = wf.readframes(1024)

       while data != '':
          stream.write(data)
          data = wf.readframes(1024)

       stream.close()
       player.terminate()
       wf.close()
       
class Services:
    
    @cherrypy.expose
    def get(self, idn):
       return "Procurar o sample com id = " + idn
    
    #@cherrypy.expose
    #def vote(self, idn, user):
	  # return "Vote up or down on a music"
	   
    #@cherrypy.expose
    #def list(self, samples):
	#   return "Lists the available samples"
    
    #@cherrypy.expose
    #def put(self):
	 #  return "Posts a music generated in the sound board"
		
cherrypy.quickstart(Root(), "/", config)

