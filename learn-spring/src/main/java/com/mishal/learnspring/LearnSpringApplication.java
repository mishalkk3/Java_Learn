package com.mishal.learnspring;

import com.mishal.learnspring.game.ContraGame;
import com.mishal.learnspring.game.GameRunner;
import com.mishal.learnspring.game.GamingConsole;
import com.mishal.learnspring.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);

		GameRunner marioRunner = context.getBean(GameRunner.class);

		//MarioGame marioGame = new MarioGame();
		//ContraGame contraGame = new ContraGame();

		//GameRunner marioRunner = new GameRunner(marioGame);
		//GameRunner contraRunner = new GameRunner(contraGame);

		marioRunner.runGame();
		//System.out.println("-------------------------------------------------");
		//contraRunner.runGame();


	}

}
