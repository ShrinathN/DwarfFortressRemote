#!/bin/python
import socket
import os

s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM, 0)
s.bind(('0.0.0.0', 8080))
while(True):
	raw_message, addr = s.recvfrom(1024)
	message = str(raw_message, 'utf-8')
	if(message[0] != '#'): #meaning the packet is not a special key
		os.system('xdotool key ' + str(message))
	else:
		if(message == '#UP'):
			os.system('xdotool key Up')
		elif(message == '#DOWN'):
			os.system('xdotool key Down')
		elif(message == '#LEFT'):
			os.system('xdotool key Left')
		elif(message == '#RIGHT'):
			os.system('xdotool key Right')
		elif(message == '#PLUS'):
			os.system('xdotool key plus')
		elif(message == '#MINUS'):
			os.system('xdotool key minus')
		elif(message == '#GREATER'):
			os.system('xdotool key greater')
		elif(message == '#LESS'):
			os.system('xdotool key less')
		elif(message == '#RETURN'):
			os.system('xdotool key Return')
		