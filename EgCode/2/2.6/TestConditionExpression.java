class TestConditionExpression{
	public static void main(String[] args) {
		float sum =1.5f;
		int num =2;
		System.out.println((sum<2?1:num/sum));//sum大于2吗，大于的话输出1，不大于的话输出num/sum
	}
}