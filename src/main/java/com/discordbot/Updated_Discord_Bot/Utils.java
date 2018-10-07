package com.discordbot.Updated_Discord_Bot;

import java.awt.Color;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.client.entities.Application.Bot;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Channel;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Utils extends ListenerAdapter
{
    public static void main(String[] args)
            throws LoginException
    {
    	
        JDA jda = new JDABuilder(Config.token).build();
        jda.getPresence().setGame(Game.playing("Bot Built By @TaZe_Pug")); 
        jda.addEventListener(new Utils());
        jda.addEventListener(new Mod());
    }



public void onMessageReceived(MessageReceivedEvent event)
{
	// The objects
	
	
	Message message = event.getMessage();
	User author = event.getMessage().getAuthor();
	MessageChannel channel = event.getTextChannel();
	String[] args = event.getMessage().getContentRaw().split(" ");
	
	
	// Utility Commands
	
	if (args[0].equalsIgnoreCase(Config.prefix + "help")) {

		if (args.length >= 2) {
			if (args[1].equalsIgnoreCase("poll")|args[1].equalsIgnoreCase(Config.prefix + "poll")) {
				EmbedBuilder eb = new EmbedBuilder();
				eb.setColor(Color.BLUE);
				eb.setTitle(Config.prefix + "poll");
				eb.setDescription(Config.prefix + "poll <The thing you want to start a poll for>");
				eb.setFooter("Developed by @TaZe_Pug", null);
				channel.sendMessage(eb.build()).queue();
			}
				if (args[1].equalsIgnoreCase("help")|args[1].equalsIgnoreCase(Config.prefix + "help")) {
					EmbedBuilder eb = new EmbedBuilder();
					eb.setColor(Color.BLUE);
					eb.setTitle(Config.prefix + "help");
					eb.setDescription(Config.prefix + "Lists all of the commands available\n Or use /help <command> to find out more info on what a command does");
					eb.setFooter("Developed by @TaZe_Pug", null);
					channel.sendMessage(eb.build()).queue();
				}
			
				if (args[1].equalsIgnoreCase("ban")|args[1].equalsIgnoreCase(Config.prefix + "ban")) {
					EmbedBuilder eb = new EmbedBuilder();
					eb.setColor(Color.BLUE);
					eb.setTitle(Config.prefix + "ban");
					eb.setDescription("Bans a player\n\n" + Config.prefix + "ban <@member> <reason>");
					eb.setFooter("Developed by @TaZe_Pug", null);
					channel.sendMessage(eb.build()).queue();
				}
				
				if (args[1].equalsIgnoreCase("unban")|args[1].equalsIgnoreCase(Config.prefix + "unban")) {
					EmbedBuilder eb = new EmbedBuilder();
					eb.setColor(Color.BLUE);
					eb.setTitle(Config.prefix + "unban");
					eb.setDescription("UnBans a player\n\n" + Config.prefix + "unban <@member>");
					eb.setFooter("Developed by @TaZe_Pug", null);
					channel.sendMessage(eb.build()).queue();
				}
				
				if (args[1].equalsIgnoreCase("mute")|args[1].equalsIgnoreCase(Config.prefix + "mute")) {
					EmbedBuilder eb = new EmbedBuilder();
					eb.setColor(Color.BLUE);
					eb.setTitle(Config.prefix + "mute");
					eb.setDescription("Mutes a player\n\n" + Config.prefix + "mute <@member> <reason>");
					eb.setFooter("Developed by @TaZe_Pug", null);
					channel.sendMessage(eb.build()).queue();
				}
				
				if (args[1].equalsIgnoreCase("unmute")|args[1].equalsIgnoreCase(Config.prefix + "unmute")) {
					EmbedBuilder eb = new EmbedBuilder();
					eb.setColor(Color.BLUE);
					eb.setTitle(Config.prefix + "unmute");
					eb.setDescription("Unmutes a player\n\n" + Config.prefix + "unmute <@member>");
					eb.setFooter("Developed by @TaZe_Pug", null);
					channel.sendMessage(eb.build()).queue();
				}
				
				if (args[1].equalsIgnoreCase("kick")|args[1].equalsIgnoreCase(Config.prefix + "kick")) {
					EmbedBuilder eb = new EmbedBuilder();
					eb.setColor(Color.BLUE);
					eb.setTitle(Config.prefix + "kick");
					eb.setDescription("Kicks a player\n\n" + Config.prefix + "kick <@member> <reason>");
					eb.setFooter("Developed by @TaZe_Pug", null);
					channel.sendMessage(eb.build()).queue();
				}
				
				if (args[1].equalsIgnoreCase("clear")|args[1].equalsIgnoreCase(Config.prefix + "clear")) {
					EmbedBuilder eb = new EmbedBuilder();
					eb.setColor(Color.BLUE);
					eb.setTitle(Config.prefix + "clear");
					eb.setDescription("Clears <ammount> of messages\n\n" + Config.prefix + "clear <ammount>");
					eb.setFooter("Developed by @TaZe_Pug", null);
					channel.sendMessage(eb.build()).queue();
				}
				
		} else {
		
		EmbedBuilder eb = new EmbedBuilder();
		eb.setColor(Color.green);
		eb.setTitle("Help");
		eb.setDescription("For more info on a command do /help <command>");
		eb.addBlankField(false);
		eb.addField("Commands", Config.prefix + "help\n" + Config.prefix +"poll", false);
		eb.addField("Staff Commands", Config.prefix + "Ban\n" + Config.prefix + "Unban\n" + Config.prefix +"Mute\n" + Config.prefix + "Unmute\n" + Config.prefix + "Kick\n" + Config.prefix + "Clear", false);
		eb.setFooter("Developed by @TaZe_Pug", null);
		
		channel.sendMessage(eb.build()).queue();
	
	}
	}
}
}


