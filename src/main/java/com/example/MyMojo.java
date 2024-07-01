package com.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "mygoal")
public class MyMojo extends AbstractMojo {
	
	public void execute() throws MojoExecutionException {
        getLog().info("Hello, this is my custom Maven plugin!");
    }
}