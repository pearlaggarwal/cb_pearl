package dsa;

public class bsinsearchspace {

    static int reachcentre(int dist,int time){
        int lowspeed=0;
        int highspeed=200;
        int optimalspeed=-1;
        while(lowspeed<=highspeed){
            int midspeed=highspeed-(highspeed-lowspeed)/2;
            if(check(midspeed,dist,time)){
                optimalspeed=midspeed;
                highspeed=midspeed-1;
            }
            else 
                lowspeed=midspeed+1;
        }
        return optimalspeed;
    }

    static boolean check(int speed,int dist,int time){
        int dist_travelled=speed*time;
        // if(dist_travelled>=dist) return true;
        // else  return false;
        return(dist_travelled>=dist);
    }

    
    
    public static void main(String[] args) {
        int dist=1000;
        int time=2;
        System.out.println(reachcentre(dist, time));
    }
    
    // koko eating banana

    static int mineatingspeed(int[] arr,int h){
        int low=1,high=Math.pow(10,9);
        int ans=high;
        while(low<=high){
            int mid=high-(high-low)/2;
            if check(mid,h,arr){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }

            return ans;
        }
    }

    boolean check(int speed,int time,int[] ar){
        int tt=0;
        for(int i=0;i<arr.legnth;i++){
            tt+=arr[i]/speed;
            if(arr[i]%speed!=0){
                tt+=1;

            }
        }
        return (tt<=time);
    }

    public static void main(String[] args) {

        
    }

    // magnetic force between two balls

    static int maxdistance(int[] arr,int h){
        int low=1,high=arr[arr.length-1]-arr[0];
        int ans=1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(mid,arr,h)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    boolean check(int distance,int[] arr,int balls){
        int count=1;
        int lastpos=arr[0];
        //for(int i=1;i<arr.length && count<balls;i++)
        for(int i=1;i<=arr.length;i++){
            if(arr[i]-lastpos>=mid){
                lastpos=arr[i];
                count++;
            }
        }
        //return(count==balls);
        return (count>=balls);
    }



    // repair cars

    static int repaircars(int[] arr,int cars){
        long low=1,high=Long.MAX_VALUE;
        long ans=high;
        while(low<=high){
            long mid=high-(high-low)/2;
            if (check(arr,cars,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    boolean check(int[] arr,int cars,long time){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=Math.sqrt(time/ar[i]);
        }
        return (count>=cars);
    }



    }


    





