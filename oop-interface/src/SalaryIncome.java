
public class SalaryIncome extends BaseIncome{

	public SalaryIncome(double income) {
		this.income=income;
	}
	public double getTax() {
		if (income <= 5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}

}
