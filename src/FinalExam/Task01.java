package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> likesMap=new LinkedHashMap<>();
        Map<String,Integer> commentsMap=new LinkedHashMap<>();
        String command= scanner.nextLine();
        while (!command.equals("Log out")){
            if (command.contains("New follower")){
                String nameNew=command.split(": ")[1];
                likesMap.putIfAbsent(nameNew,0);
                commentsMap.putIfAbsent(nameNew,0);

            } else if (command.contains("Like")) {
                String name=command.split(": ")[1];
                int likes=Integer.parseInt(command.split(": ")[2]);
                if (likesMap.containsKey(name)) {

                    likesMap.put(name,likesMap.get(name)+likes);
                }else{
                    likesMap.put(name,likes);
                    commentsMap.put(name,0);
                }
                
            } else if (command.contains("Comment")) {
                String nameComment=command.split(": ")[1];
                if (commentsMap.containsKey(nameComment)){
                    commentsMap.put(nameComment,commentsMap.get(nameComment)+1);
                }else {
                    commentsMap.put(nameComment,1);
                    likesMap.put(nameComment,0);
                }
                
            } else if (command.contains("Blocked")) {
                String nameToBlock=command.split(": ")[1];
                if (likesMap.containsKey(nameToBlock)){
                    likesMap.remove(nameToBlock);
                    commentsMap.remove(nameToBlock);
                }else System.out.printf("%s doesn't exist.\n",nameToBlock);
            }

            command= scanner.nextLine();
        }
        System.out.printf("%d followers\n", likesMap.size());
        for (Map.Entry<String, Integer> item : likesMap.entrySet()) {
            System.out.printf("%s: %d\n",item.getKey(),item.getValue()+commentsMap.get(item.getKey()));
        }


    }
}
