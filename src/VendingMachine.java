import java.util.ArrayList;

public class VendingMachine {

static void calculateChange(ArrayList<Integer> coinDenomination,float itemAmount,float userAmount){
            float change=userAmount-itemAmount;
                if(change<1){
                    int i= (int) (change*100);
                    ArrayList<Integer> cent=calculateCent(coinDenomination,i);
                    System.out.println("cent"+cent);

                    //cents
                }
                else if ((userAmount-itemAmount)==0.00) {
                    //int i=(int) (change*100);
                    ArrayList<Integer> whole=calculateWhole(coinDenomination,(int)change);
                    System.out.println("whole"+whole);
                }
                else if((userAmount-itemAmount)!=0.0)
                {
                    //int w=(int)(change*100);
                    ArrayList<Integer> whole=calculateWhole(coinDenomination,(int)change);
                    System.out.println("whole"+whole);
                    String n=String.valueOf(change);
                    n=n.substring(n.indexOf(".")).substring(1);
                    int c=Integer.parseInt(n);
                    ArrayList<Integer> cent=calculateCent(coinDenomination,c);
                    System.out.println("cent"+cent);
                   // cents & whole
                   }


        }
static ArrayList<Integer> calculateCent(ArrayList<Integer>coinDenomination,int change){
    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    getCombC(coinDenomination,change,0,res,new ArrayList<Integer>());
    ArrayList<Integer> fin=null;
    int min=Integer.MAX_VALUE;
    for(ArrayList<Integer> a:res){
        if (a.size()<min){
            fin=a;
        }
    }
    //System.out.println(fin);
    return fin;
}

    static ArrayList<Integer> calculateWhole(ArrayList<Integer>coinDenomination,int change){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        getCombW(coinDenomination,change,0,res,new ArrayList<Integer>());
        ArrayList<Integer> fin=null;
        int min=Integer.MAX_VALUE;
        for(ArrayList<Integer> a:res){
            if (a.size()<min){
                fin=a;
            }
        }
        //System.out.println(fin);
        return fin;
    }


    static void getCombC(ArrayList<Integer>coinDenomination,int target,int i,ArrayList<ArrayList<Integer>> res,ArrayList<Integer>list)
    {
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(i>=coinDenomination.size()||target<0){
            return;
        }
        if(coinDenomination.get(i)<=target){
            list.add(coinDenomination.get(i));
            getCombC(coinDenomination,target-coinDenomination.get(i),i,res,list);
            list.remove(list.size()-1);
        }
        getCombC(coinDenomination,target,i+1,res,list);
    }

    static void getCombW(ArrayList<Integer>coinDenomination,int target,int i,ArrayList<ArrayList<Integer>> res,ArrayList<Integer>list)
    {
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(i>=coinDenomination.size()||target<0){
            return;
        }
        if(coinDenomination.get(i)<=target){
            list.add(coinDenomination.get(i));
            getCombW(coinDenomination,target-coinDenomination.get(i),i,res,list);
            list.remove(list.size()-1);
        }
        getCombW(coinDenomination,target,i+1,res,list);
    }
}
