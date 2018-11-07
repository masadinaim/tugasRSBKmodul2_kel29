/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Masadi
 */
@Stateless
@LocalBean
public class paypdam {
    
    DecimalFormat a = new DecimalFormat("0.0");
    String result;

    public String pay_pdam(double param) {
        return result = a.format(param*2000);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
