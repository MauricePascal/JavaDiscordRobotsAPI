# JDR
This is the official DiscordRobotsAPI for JDA. You can work with votes a so many more

# Overview
* [Setup](https://github.com/MauricePascal/JavaDiscordRobotsAPI/blob/master/README.md#creating-the-discordrobotsapi-object)
* [Votes](https://github.com/MauricePascal/JavaDiscordRobotsAPI/blob/master/README.md#votes)
* [Download](https://github.com/MauricePascal/JavaDiscordRobotsAPI/blob/master/README.md#download)
* [Support](https://github.com/MauricePascal/JavaDiscordRobotsAPI/blob/master/README.md#support)

## Creating the JDR Object
This is the setup for your Bot. Replace "token" with the DiscordRobots Token of your Bot
 
```java
    JDR jdr = new JDR.Builder()
        .setToken(token)
        .build();
```

## Votes
Work with votes

```java
    String userId = [...]
    //or
    long userId = [...]
    if(Vote.isVoted(userId)) {
        [...]
    }
```

## Download
[![](https://jitpack.io/v/MauricePascal/JavaDiscordRobotsAPI.svg)](https://jitpack.io/#MauricePascal/JavaDiscordRobotsAPI)

Replace `VERSION` with the latest version or commit hash. The latest version can be found under releases.

#### Maven

If Maven doesnt work, please download the [.jar File](https://www.keksstudios.tk/discordrobots/api/JDR.jar) and add it to your Bot

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependencies>
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20160810</version>
        <scope>compile</scope>
    </dependency>
    <dependency>
        <groupId>com.github.MauricePascal</groupId>
        <artifactId>JavaDiscordRobotsAPI</artifactId>
        <version>VERSION</version>
    </dependency>
</dependencies>
```

#### Gradle 
```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```
```gradle
dependencies {
    compile 'com.github.MauricePascal:JavaDiscordRobotsAPI:VERSION'
}
```

## Support
* [Discord-Server](https://discord.gg/ExCrcDX)
* [Website](https://www.keksstudios.tk/discordrobots)
* [Documentation](#)
