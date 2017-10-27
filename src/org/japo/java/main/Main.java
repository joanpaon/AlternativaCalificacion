/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Referencias
        final String CAL_NE = "No evaluado";
        final String CAL_NP = "No presentado";
        final String CAL_MD = "Muy deficiente";
        final String CAL_IN = "Insuficiente";
        final String CAL_SF = "Suficiente";
        final String CAL_BN = "Bien";
        final String CAL_NT = "Notable";
        final String CAL_SB = "Sobresaliente";
        final String CAL_XX = "Calificación errónea";

        // Instancia un objeto Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        // Variables
        String calDes;

        try {
            // Introduce la calificación numérica
            System.out.print("Calificación numérica ....: ");
            int calNum = scn.nextInt();
            scn.nextLine();

            // Gestiona la nota
            switch (calNum) {
                case 0:
                    calDes = CAL_NE;
                    break;
                case 1:
                    calDes = CAL_NP;
                    break;
                case 2:
                case 3:
                    calDes = CAL_MD;
                    break;
                case 4:
                    calDes = CAL_IN;
                    break;
                case 5:
                    calDes = CAL_SF;
                    break;
                case 6:
                    calDes = CAL_BN;
                    break;
                case 7:
                case 8:
                    calDes = CAL_NT;
                    break;
                case 9:
                    calDes = CAL_SB;
                    break;
                default:
                    calDes = CAL_XX;
            }

            // Muestra la calificación
            System.out.printf("Calificación descriptiva .: %s\n", calDes);
        } catch (Exception e) {
            System.out.println(">>> Error de entrada");
        }
    }
}
