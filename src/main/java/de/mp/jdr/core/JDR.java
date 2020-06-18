package de.mp.jdr.core;
/*
 *  Created by Maurice-Pascal at 20:37 on 17.06.2020
 */

import de.mp.jdr.impl.JDRImpl;

public interface JDR {
    class Builder {
        private String token = null;
        public Builder token(String token) {
            this.token = token;
            return this;
        }
        public JDR build() {
            if (token == null) {
                throw new IllegalArgumentException("The provided token cannot be null!");
            }
            return new JDRImpl(token);
        }
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
