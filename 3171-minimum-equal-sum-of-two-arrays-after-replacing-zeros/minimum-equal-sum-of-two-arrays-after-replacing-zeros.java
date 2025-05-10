class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int a=0,b=0;
        long suma=0,sumb=0;
        for(int i:nums1) {if(i==0) a++; suma+=i;}
        for(int i:nums2){ if(i==0) b++; sumb+=i;}
        if(a==0 && b==0){
            if(suma==sumb) return suma;
            else return -1;
        }
        if(a==0) {
            if(sumb>=suma) return -1;
            else {
                if(b==1) return suma;
                else {
                    if(suma>=sumb+b) return suma;
                    else return -1;
                }
            }
        }else if(b==0){
            if(suma>=sumb) return -1;
            else {
                if(a==1) return sumb;
                else {
                    if(sumb>=suma+a){ return sumb;}
                    else return -1;
                }
            }
        }
        else {
            if(sumb>suma){
               if(suma+a>sumb+b) return suma+a;
               else return sumb+b;
            }else if(suma>sumb){
                if(suma+a<sumb+b) return sumb+b;
                else return suma+a;
            }
            else{ return suma+Math.max(a,b);}
        }
    }
}