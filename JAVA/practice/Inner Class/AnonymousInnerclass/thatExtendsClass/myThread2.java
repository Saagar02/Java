class Test {

    public static void main(String[] args) {

        Thread t1 = new Thread(){
		public void run(){
			System.out.println("Using Anonymous Inner Class");
		}
	};
	t1.start();
    }
}

