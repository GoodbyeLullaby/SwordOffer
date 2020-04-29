import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/11
 */

public class thirtyfive {
	public int InversePairs(int [] array) {
		if(array==null||array.length<2)
			return 0;

		int temp[]=new int[array.length];

		return Inverse(array,0,array.length-1,temp)%1000000007;
	}

	public int Inverse(int[] array, int left, int right, int[] temp) {
		if(left>=right)
			return 0;
		int mid=(left+right)>>>1;
		int leftSum=Inverse(array, left, mid, temp)%1000000007;
		int rightSum=Inverse(array, mid+1, right, temp)%1000000007;
		if(array[mid]<array[mid+1]){
			return (leftSum+rightSum)%1000000007;
		}
		return (leftSum+rightSum+MergeSort(array,left,mid,right,temp))%1000000007;

	}

	public int MergeSort(int[] array, int left, int mid, int right, int[] temp) {
		for(int i=left;i<=right;i++){
			temp[i]=array[i];
		}
		int a=left;
		int b=mid+1;
		int res=0;
		for(int i=left;i<=right;i++){
			if(a>mid){
				array[i]=temp[b];
				b++;
			}else if(b>right){
				array[i]=temp[a];
				a++;
			}else if(temp[a]<=temp[b]){
				array[i]=temp[a];
				a++;
			}else {
				array[i]=temp[b];
				b++;
				res+=mid-a+1;
			}
		}
		return res%1000000007;
	}

	@Test
	public void test(){
//		int arr[]={364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
		int arr[]={7,5,6,4};
//		System.out.println(arr.length);
		System.out.println(InversePairs(arr));
	}
}
