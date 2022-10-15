package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {	
	this.categoryDao = categoryDao;
	this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		Category[] categories = {new Category(1, "backend"), new Category(2, "Fronted"), new Category(3, "mobile")};
		for (Category categories2 : categories) {
			if (category.getCategoryName() == categories2.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	
	
	
	}
}
