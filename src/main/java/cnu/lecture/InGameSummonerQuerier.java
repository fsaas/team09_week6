package cnu.lecture;

import com.google.gson.GsonBuilder;

import java.io.InputStream;

/**
 * Created by tchi on 2016. 4. 25..
 */
public class InGameSummonerQuerier extends querier {
	public InGameSummonerQuerier(String apiKey, GameParticipantListener listener) {
	       super(apiKey,listener);
	}
}
