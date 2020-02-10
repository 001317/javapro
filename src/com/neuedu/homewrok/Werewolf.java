package com.neuedu.homewrok;




import java.util.*;

public class Werewolf {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入玩家人数");
        //number定义玩家人数
        int number = input.nextInt();
        if(number<12||number>18) {
            System.out.println("玩家人数输入出错，请重新输入：");
        }else {
            System.out.println("祝玩的开心");
        }
        input.close();
        //cards1为神数组，cards2为村民数组，cards3为狼人数组
        String[] cards1= new String[]{ "预言家", "女巫", "丘比特", "守卫", "猎人",
                "村长", "替罪羊", "吹笛者","盗贼"};
        String[] cards2= new String[] {"村民","村民","村民","村民","村民","村民","村民",};
        String[] cards3= new String[] {"狼人","狼人","狼人","狼人","狼人","狼人"};
        //定义玩家序号
        String[] serialPlay=new String[] { "01:", "02:", "03:", "04:", "05:", "06:", "07:", "08:", "09:", "10:", "11:",
                "12:", "13:", "14:", "15:", "16:", "17:", "18:"  };
        //定义底牌序号
        String[] serialBottom=new String[]{ "01:", "02:", "03:" };

        if(number==12) {
            //当玩家为12人时，总牌数为15
            String[] allPlayCards=new String[15];
            for(int i=0;i<serialPlay.length;i++) {
                System.arraycopy(cards1, 0, allPlayCards, 0, 6);
                System.arraycopy(cards2, 0, allPlayCards, 6, 4);
                System.arraycopy(cards3, 0, allPlayCards, 10, 4);
                System.arraycopy(cards1, 8, allPlayCards, 14,1);
            }
            //玩家的12张牌
            String[] playCards = new String[12];
            //底牌3张
            String[] bottomCards = new String[3];
            //用random随机排序
            for(int i=0;i<13;i++) {
                int random =(int)(Math.random()*13);
                String temp = "";
                temp = allPlayCards[i];
                allPlayCards[i]=allPlayCards[random];
                allPlayCards[random]=temp;
            }
            //遍历出玩家的牌
            for(int i=0;i<12;i++) {
                System.arraycopy(allPlayCards, 2, playCards, 0, 11);
                System.arraycopy(allPlayCards, 14, playCards, 11, 1);
            }
            //遍历出底牌
            for(int i=0;i<serialBottom.length;i++) {
                System.arraycopy(allPlayCards, 13, bottomCards, 0, 1);
                System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
                System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);
            }
            //将序号与牌面结合输出
            for (int i = 0; i < 12; i++) {
                playCards[i]=serialPlay[i]+playCards[i];
            }
            System.out.println("玩家牌为：");
            System.out.println(Arrays.toString(playCards));
            for (int i = 0; i < 3; i++) {
                bottomCards[i]=serialBottom[i]+bottomCards[i];
            }
            System.out.println("底牌为：");
            System.out.println(Arrays.toString(bottomCards));

        }

        if(number==13) {
            //当玩家为13人时，总牌数为16
            String[] allPlayCards=new String[16];
            for(int i=0;i<serialPlay.length;i++) {
                System.arraycopy(cards1, 0, allPlayCards, 0, 6);
                System.arraycopy(cards2, 0, allPlayCards, 6, 5);
                System.arraycopy(cards3, 0, allPlayCards, 11, 4);
                System.arraycopy(cards1, 8, allPlayCards, 15,1);
            }
            //玩家的13张牌
            String[] playCards = new String[13];
            //底牌3张
            String[] bottomCards = new String[3];
            for(int i=0;i<14;i++) {
                int random =(int)(Math.random()*14);
                String temp = "";
                temp = allPlayCards[i];
                allPlayCards[i]=allPlayCards[random];
                allPlayCards[random]=temp;
            }
//			System.out.println(Arrays.toString(allPlayCards));
            for(int i=0;i<13;i++) {
                System.arraycopy(allPlayCards, 2, playCards, 0, 13);
                System.arraycopy(allPlayCards, 15, playCards, 12, 1);
            }
            for(int i=0;i<serialBottom.length;i++) {
                System.arraycopy(allPlayCards, 14, bottomCards, 0, 1);
                System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
                System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);
            }
            for (int i = 0; i < 13; i++) {
                playCards[i]=serialPlay[i]+playCards[i];
            }
            System.out.println("玩家牌为：");
            System.out.println(Arrays.toString(playCards));
            for (int i = 0; i < 3; i++) {
                bottomCards[i]=serialBottom[i]+bottomCards[i];
            }
            System.out.println("底牌为：");
            System.out.println(Arrays.toString(bottomCards));

        }

        if(number==14) {
            //当玩家为14人时，总牌数为17
            String[] allPlayCards=new String[17];
            for(int i=0;i<serialPlay.length;i++) {
                System.arraycopy(cards1, 0, allPlayCards, 0, 6);
                System.arraycopy(cards2, 0, allPlayCards, 6, 5);
                System.arraycopy(cards3, 0, allPlayCards, 11,5);
                System.arraycopy(cards1, 8, allPlayCards, 16,1);
            }
            //玩家的13张牌
            String[] playCards = new String[14];
            //底牌3张
            String[] bottomCards = new String[3];
            for(int i=0;i<15;i++) {
                int random =(int)(Math.random()*15);
                String temp = "";
                temp = allPlayCards[i];
                allPlayCards[i]=allPlayCards[random];
                allPlayCards[random]=temp;
            }
//			System.out.println(Arrays.toString(allPlayCards));
            for(int i=0;i<14;i++) {
                System.arraycopy(allPlayCards, 2, playCards, 0, 13);
                System.arraycopy(allPlayCards, 16, playCards, 13, 1);
            }
            for(int i=0;i<serialBottom.length;i++) {
                System.arraycopy(allPlayCards, 15, bottomCards, 0, 1);
                System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
                System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);
            }
            for (int i = 0; i < 14; i++) {
                playCards[i]=serialPlay[i]+playCards[i];
            }
            System.out.println("玩家牌为：");
            System.out.println(Arrays.toString(playCards));
            for (int i = 0; i < 3; i++) {
                bottomCards[i]=serialBottom[i]+bottomCards[i];
            }
            System.out.println("底牌为：");
            System.out.println(Arrays.toString(bottomCards));

        }

        if(number==15) {
            //当玩家为15人时，总牌数为18
            String[] allPlayCards=new String[18];
            for(int i=0;i<serialPlay.length;i++) {
                System.arraycopy(cards1, 0, allPlayCards, 0, 7);
                System.arraycopy(cards2, 0, allPlayCards, 7, 5);
                System.arraycopy(cards3, 0, allPlayCards, 12,5);
                System.arraycopy(cards1, 8, allPlayCards, 17,1);
            }
            //玩家的15张牌
            String[] playCards = new String[15];
            //底牌3张
            String[] bottomCards = new String[3];
            for(int i=0;i<15;i++) {
                int random =(int)(Math.random()*16);
                String temp = "";
                temp = allPlayCards[i];
                allPlayCards[i]=allPlayCards[random];
                allPlayCards[random]=temp;
            }
            for(int i=0;i<15;i++) {
                System.arraycopy(allPlayCards, 2, playCards, 0, 14);
                System.arraycopy(allPlayCards, 17, playCards, 14, 1);
            }
            for(int i=0;i<serialBottom.length;i++) {
                System.arraycopy(allPlayCards, 16, bottomCards, 0, 1);
                System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
                System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);
            }
            for (int i = 0; i < 15; i++) {
                playCards[i]=serialPlay[i]+playCards[i];
            }
            System.out.println("玩家牌为：");
            System.out.println(Arrays.toString(playCards));
            for (int i = 0; i < 3; i++) {
                bottomCards[i]=serialBottom[i]+bottomCards[i];
            }
            System.out.println("底牌为：");
            System.out.println(Arrays.toString(bottomCards));

        }

        if(number==16) {
            //当玩家为16人时，总牌数为19
            String[] allPlayCards=new String[19];
            for(int i=0;i<serialPlay.length;i++) {
                System.arraycopy(cards1, 0, allPlayCards, 0, 7);
                System.arraycopy(cards2, 0, allPlayCards, 7, 6);
                System.arraycopy(cards3, 0, allPlayCards, 13,5);
                System.arraycopy(cards1, 8, allPlayCards, 18,1);
            }
            //玩家的16张牌
            String[] playCards = new String[16];
            //底牌3张
            String[] bottomCards = new String[3];
            for(int i=0;i<15;i++) {
                int random =(int)(Math.random()*16);
                String temp = "";
                temp = allPlayCards[i];
                allPlayCards[i]=allPlayCards[random];
                allPlayCards[random]=temp;
            }
            for(int i=0;i<16;i++) {
                System.arraycopy(allPlayCards, 2, playCards, 0, 15);
                System.arraycopy(allPlayCards, 18, playCards, 15, 1);
            }
            for(int i=0;i<serialBottom.length;i++) {
                System.arraycopy(allPlayCards, 17, bottomCards, 0, 1);
                System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
                System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);
            }
            for (int i = 0; i < 16; i++) {
                playCards[i]=serialPlay[i]+playCards[i];
            }
            System.out.println("玩家牌为：");
            System.out.println(Arrays.toString(playCards));
            for (int i = 0; i < 3; i++) {
                bottomCards[i]=serialBottom[i]+bottomCards[i];
            }
            System.out.println("底牌为：");
            System.out.println(Arrays.toString(bottomCards));
        }

        if(number==17) {
            //当玩家为17人时，总牌数为20
            String[] allPlayCards=new String[20];
            for(int i=0;i<serialPlay.length;i++) {
                System.arraycopy(cards1, 0, allPlayCards, 0, 7);
                System.arraycopy(cards2, 0, allPlayCards, 7, 6);
                System.arraycopy(cards3, 0, allPlayCards, 13,6);
                System.arraycopy(cards1, 8, allPlayCards, 19,1);
            }
            //玩家的17张牌
            String[] playCards = new String[17];
            //底牌3张
            String[] bottomCards = new String[3];
            for(int i=0;i<16;i++) {
                int random =(int)(Math.random()*17);
                String temp = "";
                temp = allPlayCards[i];
                allPlayCards[i]=allPlayCards[random];
                allPlayCards[random]=temp;
            }
            for(int i=0;i<17;i++) {
                System.arraycopy(allPlayCards, 2, playCards, 0, 16);
                System.arraycopy(allPlayCards, 19, playCards, 16, 1);
            }
            for(int i=0;i<serialBottom.length;i++) {
                System.arraycopy(allPlayCards, 18, bottomCards, 0, 1);
                System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
                System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);
            }
            for (int i = 0; i < 17; i++) {
                playCards[i]=serialPlay[i]+playCards[i];
            }
            System.out.println("玩家牌为：");
            System.out.println(Arrays.toString(playCards));
            for (int i = 0; i < 3; i++) {
                bottomCards[i]=serialBottom[i]+bottomCards[i];
            }
            System.out.println("底牌为：");
            System.out.println(Arrays.toString(bottomCards));

        }

        if(number==18) {
            //当玩家为18人时，总牌数为21
            String[] allPlayCards=new String[21];
            for(int i=0;i<serialPlay.length;i++) {
                System.arraycopy(cards1, 0, allPlayCards, 0, 7);
                System.arraycopy(cards2, 0, allPlayCards, 7, 7);
                System.arraycopy(cards3, 0, allPlayCards, 14,6);
                System.arraycopy(cards1, 8, allPlayCards, 20,1);
            }
            //玩家的17张牌
            String[] playCards = new String[18];
            //底牌3张
            String[] bottomCards = new String[3];
            for(int i=0;i<17;i++) {
                int random =(int)(Math.random()*18);
                String temp = "";
                temp = allPlayCards[i];
                allPlayCards[i]=allPlayCards[random];
                allPlayCards[random]=temp;
            }
            for(int i=0;i<18;i++) {
                System.arraycopy(allPlayCards, 2, playCards, 0, 17);
                System.arraycopy(allPlayCards, 20, playCards, 17, 1);
            }
            for(int i=0;i<serialBottom.length;i++) {
                System.arraycopy(allPlayCards, 19, bottomCards, 0, 1);
                System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
                System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);
            }
            for (int i = 0; i < 18; i++) {
                playCards[i]=serialPlay[i]+playCards[i];
            }
            System.out.println("玩家牌为：");
            System.out.println(Arrays.toString(playCards));
            for (int i = 0; i < 3; i++) {
                bottomCards[i] = serialBottom[i]+bottomCards[i];
            }
            System.out.println("底牌为：");
            System.out.println(Arrays.toString(bottomCards));

        }


    }

}
