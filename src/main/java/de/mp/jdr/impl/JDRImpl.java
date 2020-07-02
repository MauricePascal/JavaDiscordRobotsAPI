package de.mp.jdr.impl;
/*
 *  Created by Maurice-Pascal at 20:38 on 17.06.2020
 */

import de.mp.jdr.core.JDR;
import de.mp.jdr.exception.ApiConnectionException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JDRImpl implements JDR
{

    public static String token = "";

    public JDRImpl(String token)
    {
        JDRImpl.token = token.replaceAll(" ", "");
        try
        {
            final JSONObject jsonObject = getObjectFromWebsite("https://discordrobots-api.000webhostapp.com/conn/test.php?token=" + token);
            boolean isConnected = jsonObject.getBoolean("connected");
            if(!isConnected)
            {
                throw new ApiConnectionException();
            }
            else
            {
                System.out.println("Successfully created connection to api");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static JSONObject getObjectFromWebsite(final String url) throws IOException
    {
        try (InputStream inputStream = new URL(url).openStream())
        {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            final String rawJsonText = read(bufferedReader);
            return new JSONObject(rawJsonText);
        }
    }

    private static String read(final Reader reader) throws IOException
    {
        final StringBuilder stringBuilder = new StringBuilder();
        int counter;
        while((counter = reader.read()) != -1) {
            stringBuilder.append((char) counter);
        }
        return stringBuilder.toString();
    }

    public static String getToken()
    {
        return token;
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
