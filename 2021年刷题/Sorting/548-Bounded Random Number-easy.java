class Solution {
	public int random(int a, int b) {
                Random rand = new Random();
                return a + rand.nextInt(b - a + 1);
	}
}