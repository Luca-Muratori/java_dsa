import java.util.*;

public class ActivitySelection {
    
    static void activitySelection(ArrayList<Activity> activityList){
        Comparator<Activity> finishTimeComparator=new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2){
                return o1.getFinish() - o2.getStart();
            }
        };
        Collections.sort(activityList, finishTimeComparator);

        Activity prev=activityList.get(0);

        System.out.println("Recommended schedule: " + activityList.get(0));
        for (int i = 1; i < activityList.size(); i++) {
            Activity activity=activityList.get(i);
            if(activity.getStart()>=prev.getFinish()){
                System.out.println(activity);
                prev=activity;
            }
        }
    }
}
