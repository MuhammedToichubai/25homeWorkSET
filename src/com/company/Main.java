package com.company;

import jdk.internal.org.jline.utils.AttributedString;
import jdk.internal.org.jline.utils.DiffHelper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static <something> void main(String[] args) {
        /**Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
         * Метод натыйжаны жаңы set катары кайтарышы керек.
         * Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
         * Мисалы: [1, 2, 3} жана {0, 1, 2]
         *Жооп: [0, 3]
         *public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек
         **/
        Set<Integer> set1 = new HashSet<Integer>();
                set1.add(1);
                set1.add(2);
                set1.add(3);

        Set<Integer> set2 = new HashSet<Integer>();
                set2.add(0);
                set2.add(1);
                set2.add(2);

                symmetricSetDifference(set1, set2);
            }

            public static void symmetricSetDifference(Set<Integer>set1, Set<Integer>set2){
                Set<Integer> newSet = new HashSet<Integer>(set1);
                newSet.removeAll(set2);
                set2.removeAll(set1);
                newSet.addAll(set2);
                System.out.println(newSet);
            }




}
