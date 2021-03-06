package com.mcnz.rps.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestController
public class ScoreService {

	
	@Autowired
	private static Score score = new Score();

	@RequestMapping(value = "/score", method=RequestMethod.GET)
	public Score getScore() {
		System.out.println("Finding Score");
		return score;
	}
	
	@RequestMapping(value = "/score/wins", method=RequestMethod.GET)
	public int getWins() {
		//Score score = scoreRepository.findScore();
		return score.getWins();
	}
	
	@RequestMapping(value = "/score/losses", method=RequestMethod.GET)
	public int getLosses() {
		//Score score = scoreRepository.findScore();
		return score.getLosses();
	}
	
	@RequestMapping(value = "/score/ties", method=RequestMethod.GET)
	public int getTies() {
		//Score score = scoreRepository.findScore();
		return score.getTies();
	}
	
	@RequestMapping(value = "/score/wins", method=RequestMethod.POST)
	public boolean increaseWins() {
		System.out.println("POST wins");
		//Score score = scoreRepository.findScore();
		score.increaseWins();
		//System.out.println(score.getId());;
		//scoreRepository.save(score);
		return true;
	}
	
	@RequestMapping(value = "/score/losses", method=RequestMethod.POST)
	public boolean increaseLosses() {
		System.out.println("POST losses");
		//Score score = scoreRepository.findScore();
		score.increaseLosses();
		//System.out.println(score.getId());;
		//scoreRepository.save(score);
		return true;
	}
	
	@RequestMapping(value = "/score/ties", method=RequestMethod.POST)
	public boolean increaseTies() {
		System.out.println("POST ties");
		//Score score = scoreRepository.findScore();
		score.increaseTies();
		//System.out.println(score.getId());;
		//scoreRepository.save(score);
		return true;
	}
	
	@GetMapping("/increasewins")
	public Score increaseTheWins() {
		score.wins++;
		return score;
	}
	@GetMapping("/increaselosses")
	public Score increaseTheLosses() {
		score.losses++;
		return score;
	}
	@GetMapping("/increaseties")
	public Score increaseTheTies() {
		score.ties++;
		return score;
	}

}
