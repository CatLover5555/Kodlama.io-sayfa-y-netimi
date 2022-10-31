package entities;

public class Course {
	private int id;
	private int educatorId;
	private int categoryId;
	private String name;
	private double price;

	public Course() {
		super();
	}

	public Course(int id, int educatorId, int categoryId, String name, double price) {
		super();
		this.id = id;
		this.educatorId = educatorId;
		this.categoryId = categoryId;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEducatorId() {
		return educatorId;
	}

	public void setEducatorId(int educatorId) {
		this.educatorId = educatorId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
