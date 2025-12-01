/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.ManagerSale.BasicHandle;

public class EmailExampleTest {
    
    private static EmailExample emailExample;

    public boolean checkEmail(String email) {
        emailExample = new EmailExample();
        return emailExample.validate(email);
    }
    
}
