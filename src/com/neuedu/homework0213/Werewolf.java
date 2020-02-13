package com.neuedu.homework0213;

import java.util.*;

public class Werewolf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入玩家游戏人数");
        int player = input.nextInt();
        if(player<12||player>18){
            System.out.println("不符合游戏人数");
        }else{
            /*
            * 符合游戏人数后的逻辑
            *
            * 定义3个list
            * 1 发牌器的列表
            * 2 玩家的列表
            * 3 底牌的列表
            *
            * */
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> di = new ArrayList<>();
            init(all);
            pai(all,player);
            //盗贼一定在游戏的牌中  总牌中移除盗贼  放入游戏牌中
            all.remove("盗贼");
            play.add("盗贼");
            dipai(all,di);
            //将放完底牌的总牌放入游戏中
            play.addAll(all);
            //将游戏牌打乱顺序
            Collections.shuffle(play);
            System.out.println(play);
            System.out.println(di);
        }
    }
    //游戏初始化12个人
    public static void init(List<String> list){
        for(int i = 0;i<4;i++){
            list.add("村民");
        }
        for(int i = 0;i<4;i++){
            list.add("狼人");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    //根据不同的游戏人数  初始化不同的牌
    public static void pai(List<String> list,int player){
        if(player>12){
            list.add("村民");
        }
        if(player>13){
            list.add("替罪羊");
        }
        if(player>14){
            list.add("狼人");
        }
        if(player>15){
            list.add("村民");
        }
        if(player>16){
            list.add("村民");
        }
        if(player>17){
            list.add("吹笛者");
        }
    }
    public static void dipai(List<String> list,List<String> di){
        //狼人数应该小于等于1
        while(di.size()<3){
            //取list的一个随机下标
            Random random = new Random();
            int index = random.nextInt(list.size());
            if(di.contains("狼人")&&list.get(index).equals("狼人")){
                continue;
            }else{
                di.add(list.remove(index));
            }
        }
    }
}
