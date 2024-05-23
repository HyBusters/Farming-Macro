package xyz.apfelmus.cf4m.annotation.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
  String[] name();
  
  String description() default "";
}


/* Location:              C:\Users\AverageDev\AppData\Roaming\.minecraft\mods\1.8.9\w\mg_chee.jar!\xyz\apfelmus\cf4m\annotation\command\Command.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */