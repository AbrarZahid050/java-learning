package com.formatted;

import java.text.DecimalFormat;

public class FormattedOutput {
  public static void main(String[] args) {

    double num = 23.67;
    double income = 2456742.55;

    var ft = new DecimalFormat("##.#");

    System.out.println("The formated number is: " + ft.format(num));

    var currency = new DecimalFormat("$#,###,###.##");
    System.out.println("The income is: " + currency.format(income));
  }

}
