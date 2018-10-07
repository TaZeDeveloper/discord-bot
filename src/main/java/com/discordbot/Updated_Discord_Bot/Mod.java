package com.discordbot.Updated_Discord_Bot;

import java.awt.Color;
import java.util.List;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.MessageHistory;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.requests.Route.Messages;

public class Mod extends ListenerAdapter {


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
		EmbedBuilder eb = new EmbedBuilder();
		eb.setColor(Color.red);
		eb.setTitle("Ban - Success");
		eb.addBlankField(false);
		eb.setDescription("Successfully banned " + target.getAsMention());
		eb.addField("User:", target.getAsMention(), false);
		eb.addField("Mod:", author.getAsMention(), false);
		eb.addField("Reason:", reason, false);
		eb.setFooter("Developed by @TaZe_Pug", null);
		
		channel.sendMessage(eb.build()).queue();
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
		
	
	// ---------------------- {Unban Command} -------------------------
	
if (args[0].equalsIgnoreCase(Config.prefix + "unban")) {
		
		if (args.length >= 2) {
			
			
		} else {
			
			EmbedBuilder eb = new EmbedBuilder();
			eb.setColor(Color.red);
			eb.setTitle("UnBan - Incorrect Arguments");
			eb.addBlankField(false);
			eb.setDescription("**Incorrect Arguments**");
			eb.addField("Required Arguments:", Config.prefix + "unban <@member>", false);
			eb.setFooter("Developed by @TaZe_Pug", null);
			channel.sendMessage(eb.build()).queue();
			
		}
		
			if (args.length >= 2) {
        	
        	String reason = " ";
        	for(int i = 2; i < args.length; i++) {
        		reason += args[i] + " ";
        	}
			
        	
        	
        String targetid = args[1];
        String target =  args[1];
		guild.getController().unban(targetid).queue();
		EmbedBuilder eb = new EmbedBuilder();
		eb.setColor(Color.red);
		eb.setTitle("UnBan - Success");
		eb.addBlankField(false);
		eb.setDescription("Successfully unbanned " + target);
		eb.addField("User:", target, false);
		eb.addField("Mod:", author.getAsMention(), false);
		eb.setFooter("Developed by @TaZe_Pug", null);
		
		channel.sendMessage(eb.build()).queue();
			}
		
		
	}
	

	
	//---------------------------{Kick Command}--------------------------
	
	
	
	
	if (args[0].equalsIgnoreCase(Config.prefix + "kick")) {
		
		if (args.length >= 3) {
			
			
		} else {
			
			EmbedBuilder eb = new EmbedBuilder();
			eb.setColor(Color.red);
			eb.setTitle("Kick - Incorrect Arguments");
			eb.addBlankField(false);
			eb.setDescription("**Incorrect Arguments**");
			eb.addField("Required Arguments:", Config.prefix + "kick <@member> <reason>", false);
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
		guild.getController().kick(target, reason).queue();
		
		EmbedBuilder eb = new EmbedBuilder();
		eb.setColor(Color.red);
		eb.setTitle("Kick - Success");
		eb.addBlankField(false);
		eb.setDescription("Successfully kicked " + target.getAsMention());
		eb.addField("User:", target.getAsMention(), false);
		eb.addField("Mod:", author.getAsMention(), false);
		eb.addField("Reason:", reason, false);
		eb.setFooter("Developed by @TaZe_Pug", null);
		
		channel.sendMessage(eb.build()).queue();
		
			}
		
		} else {
			
			EmbedBuilder eb = new EmbedBuilder();
			eb.setColor(Color.red);
			eb.setTitle("Kick - Incorrect Arguments");
			eb.addBlankField(false);
			eb.setDescription("Please @ a member you would like to kick");
			eb.addField("Required Arguments:", Config.prefix + "kick <@member> <reason>", false);
			eb.setFooter("Developed by @TaZe_Pug", null);
			channel.sendMessage(eb.build()).queue();
			
		}
	}
	//---------------------------------------------------------------------------

	//---------------------------{Mute Command}--------------------------
	
	
	
	
	if (args[0].equalsIgnoreCase(Config.prefix + "mute")) {
		
		if (args.length >= 3) {
			
			
		} else {
			
			EmbedBuilder eb = new EmbedBuilder();
			eb.setColor(Color.red);
			eb.setTitle("Mute - Incorrect Arguments");
			eb.addBlankField(false);
			eb.setDescription("**Incorrect Arguments**");
			eb.addField("Required Arguments:", Config.prefix + "mute <@member> <reason>", false);
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
		Role muted = guild.getRolesByName("Muted", true).get(0);
		guild.getController().addRolesToMember(target, muted).queue();
		
		EmbedBuilder eb = new EmbedBuilder();
		eb.setColor(Color.red);
		eb.setTitle("Mute - Success");
		eb.addBlankField(false);
		eb.setDescription("Successfully Muted " + target.getAsMention());
		eb.addField("User:", target.getAsMention(), false);
		eb.addField("Mod:", author.getAsMention(), false);
		eb.addField("Reason:", reason, false);
		eb.setFooter("Developed by @TaZe_Pug", null);
		
		channel.sendMessage(eb.build()).queue();
		
			}
		
		} else {
			
			EmbedBuilder eb = new EmbedBuilder();
			eb.setColor(Color.red);
			eb.setTitle("Mute - Incorrect Arguments");
			eb.addBlankField(false);
			eb.setDescription("Please @ a member you would like to mute");
			eb.addField("Required Arguments:", Config.prefix + "kick <@member> <reason>", false);
			eb.setFooter("Developed by @TaZe_Pug", null);
			channel.sendMessage(eb.build()).queue();
			
		}
	}
	//----------------------------------------------------------------
	//---------------------------{UnMute Command}--------------------------
	
	
	
	
		if (args[0].equalsIgnoreCase(Config.prefix + "unmute")) {
			
			if (args.length >= 2) {
				
				
			} else {
				
				EmbedBuilder eb = new EmbedBuilder();
				eb.setColor(Color.red);
				eb.setTitle("UnMute - Incorrect Arguments");
				eb.addBlankField(false);
				eb.setDescription("**Incorrect Arguments**");
				eb.addField("Required Arguments:", Config.prefix + "unmute <@member> <reason>", false);
				eb.setFooter("Developed by @TaZe_Pug", null);
				channel.sendMessage(eb.build()).queue();
				
			}
			if (args[1].contains("@")) {
				
				
	        	
	        	
			Member target = event.getMessage().getMentionedMembers().get(0);
			Role muted = guild.getRolesByName("Muted", true).get(0);
			guild.getController().removeRolesFromMember(target, muted).queue();
			
			EmbedBuilder eb = new EmbedBuilder();
			eb.setColor(Color.red);
			eb.setTitle("UnMute - Success");
			eb.addBlankField(false);
			eb.setDescription("Successfully UnMuted " + target.getAsMention());
			eb.addField("User:", target.getAsMention(), false);
			eb.addField("Mod:", author.getAsMention(), false);
			eb.setFooter("Developed by @TaZe_Pug", null);
			
			channel.sendMessage(eb.build()).queue();
			
				
			
			} else {
				
				EmbedBuilder eb = new EmbedBuilder();
				eb.setColor(Color.red);
				eb.setTitle("UnMute - Incorrect Arguments");
				eb.addBlankField(false);
				eb.setDescription("Please @ a member you would like to mute");
				eb.addField("Required Arguments:", Config.prefix + "unmute <@member> <reason>", false);
				eb.setFooter("Developed by @TaZe_Pug", null);
				channel.sendMessage(eb.build()).queue();
				
			}
		

}
}
}