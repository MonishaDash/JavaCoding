package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Tweet {
	
	private static final List<String> hashTag = new ArrayList<String>();
	private static final Set<String> uHashTag = new HashSet<String>();
	
	public Tweet(){
		
	}
	
	public static List<String>getTweet(String tweetString){
		StringTokenizer tokenizer = new StringTokenizer(tweetString);
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			if(token.startsWith("#")){
			hashTag.add(token);
			}
		}
		return hashTag;
	}
	
	public static Set<String>getUniqueTweet(String tweetString){
		//StringTokenizer tokenizer = new StringTokenizer(tweetString);
		String[] arrWord = tweetString.split(" ");
		for(String tag : arrWord){
			if(tag.startsWith("#")){
				uHashTag.add(tag);
			}
		}
		return uHashTag;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter String: ");
		String tweetString = scanner.nextLine();
		Tweet.getUniqueTweet(tweetString);
		for(String str : uHashTag){
			System.out.println(str);
		}
		//tweet.getTweet(tweetString)
	}

}
