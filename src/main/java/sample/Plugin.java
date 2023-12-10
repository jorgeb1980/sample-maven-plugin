package sample;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "say-hello", defaultPhase = LifecyclePhase.PREPARE_PACKAGE)
public class Plugin {
    
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("hello");
    }
}
