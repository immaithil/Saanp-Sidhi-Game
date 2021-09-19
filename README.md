# Saanp-Sidhi-Game

This is a simple console based replica of an ancient Indian game which is famous all around the world popularly known as Snake and Ladder. 
To play this game go to source folder and enter in main folder and then run the play game file of java.
This game is designed to play by only two players, enter name of first player and second player and start playing.

## Working of this Project

I have used spring boot framework in it. There are two hashmaps which are used one for snake and its position and other is for ladders and its position.
Player has to throw a dice in his turn. On rolling of dice a random value between 1 to 6 will be returned by dice. The position of the respective player will be updated
according to the count returned by the dice.
If point of player coincides with position of snake or ladder then it will increase or decrease respectively.
The player who will complete the total game point will be declared as winner of this game.

## Language and Framework
This is a Maven based project completely written in java. I have used Springboot to intialize this project.
This project is part of 6 month full stack web development training program at Newton School.
To get spring initializer https://start.spring.io/
