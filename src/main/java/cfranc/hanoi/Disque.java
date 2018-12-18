package cfranc.hanoi;

public class Disque implements Comparable<Disque>{
    int d;

    public Disque(int d) {
        this.d = d;
    }

	/**
	 *
	 * @param obj
	 * @return -1 if [obj] is smaller, 1 if [obj] bigger, 0 otherwise
	 */
	@Override
	public int compareTo(Disque obj) {
		int res=0;
		if (this.d<obj.d) {
			res = -1;
		}
		else if (this.d>obj.d) {
			res = 1;
		}
		return res;
	}
}
