package com.wang.sort;

public class GetBonusId {
	int[] p = {1,2,3,4,5,6,7,8,9};
	int x = GetBonusId(p);
	public int GetBonusId(int p[]){
		float n = (float) Math.random();
		float Num=0f;
		for(int i=0;i<p.length;i++){
			if(n<Num)
				Num=Num+p[i];
			else
				return i;
			System.out.print(i);
		}
		return 0;
	}

}

