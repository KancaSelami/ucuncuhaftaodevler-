/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epolimorfizm;

/**
 *
 * @author selami
 */
public class EmailLogger extends BaseLogger{
    public void log (String message){
    
        System.out.println("Logged to E-mail: "+message);
    }
}