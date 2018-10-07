package com.discordbot.Updated_Discord_Bot;

import java.awt.Color;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Mod extends ListenerAdapter {

private static final Object nill = null;

public void onMessageReceived(MessageReceivedEvent event) {
	
	Message message = event.getMessage();
	Guild guild = event.getGuild();
	User author = event.getMessage().getAuthor();
	MessageChannel channel = event.getTextChannel();
	String[] args = event.getMessage().getContentRaw().split(" ");
	
	//-----------------------{Ban Command}-------------------------------
	
	if (args[0].equalsIgnoreCase(Config.prefix + "ban")) {
		
		if (args.length >= 3) {
			
			
		} else {
			
			EmbedBuilder eb = new EmbedBuilder();
			eb.setColor(Color.red);
			eb.setTitle("Ban - Incorrect Arguments");
			eb.addBlankField(false);
			eb.setDescription("**Incorrect Arguments**");
			eb.addField("Required Arguments:", Config.prefix + "ban <@member> <reason>", false);
			eb.setFooter("Developed by @TaZe_Pug", null);
			channel.sendMessage(eb.build()).queue();
			
		}
		if (args[1].contains("@")) {
			if (args.length >= 3) {
        	
        	String reason = " ";
        	for(int i = 2; i < args.length; i++) {
        		reason += args[i] + " ";
        	}
			
        	
        	
		Member target = event.getMessage().getMentionedMembers().get(0);
		guild.getController().ban(target, 7, reason).queue();
			}
		
		} else {
			
			EmbedBuilder eb = new EmbedBuilder();
			eb.setColor(Color.red);
			eb.setTitle("Ban - Incorrect Arguments");
			eb.addBlankField(false);
			eb.setDescription("Please @ a member you would like to ban");
			eb.addField("Required Arguments:", Config.prefix + "ban <@member> <reason>", false);
			eb.setFooter("Developed by @TaZe_Pug", null);
			channel.sendMessage(eb.build()).queue();
			
		}
	}
		

	
	//-------------------------------------------------------------------
	
	
}
}