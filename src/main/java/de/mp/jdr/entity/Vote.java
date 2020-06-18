package de.mp.jdr.entity;
/*
 *  Created by Maurice-Pascal at 19:38 on 16.06.2020
 */

import de.mp.jdr.impl.JDRImpl;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Vote {
    public static boolean isVoted(String id) {
        String token = JDRImpl.getToken();
        if(token == null) {
            return false;
        }
        try{
            final JSONObject jsonObject = getObjectFromWebsite("https://discordrobots-api.000webhostapp.com/votes/test.php?token=" + token + "&id=" + id);
            return jsonObject.getBoolean("isVoted");
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean isVoted(long id) {
        String token = JDRImpl.getToken();
        if(token == null) {
            return false;
        }
        try{
            final JSONObject jsonObject = getObjectFromWebsite("https://discordrobots-api.000webhostapp.com/votes/test.php?token=" + token + "&id=" + id);
            return jsonObject.getBoolean("isVoted");
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    private static JSONObject getObjectFromWebsite(final String url) throws IOException {
        try (InputStream inputStream = new URL(url).openStream()) {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            final String rawJsonText = read(bufferedReader);
            return new JSONObject(rawJsonText);
        }
    }
    private static String read(final Reader reader) throws IOException {
        final StringBuilder stringBuilder = new StringBuilder();
        int counter;
        while((counter = reader.read()) != -1) {
            stringBuilder.append((char) counter);
        }
        return stringBuilder.toString();
    }

    /**
     *
     * Please contact me if you have some questions:
     * Discord: https://discord.gg/ExCrcDX or "Maurice-Pascal L.#9336"
     *
     * Developed with IntelliJ Community
     *
     * Copyright (C) 2020 by Maurice-Pascal Larvière, all rights reserved
     * All codes are selfmade
     * Copy paste is not allowed
     *
     */

}
