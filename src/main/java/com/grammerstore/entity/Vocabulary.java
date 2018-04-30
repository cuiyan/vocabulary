package com.grammerstore.entity;


public class Vocabulary {
	private Integer id;
	/**
	 * 章节id
	 */
	private Integer timetableId;
	/**
	 * 单词
	 */
	private String word;
	/**
	 * 对应句子
	 */
	private String sentence;
	/**
	 * 音标
	 */
	private String phoneticSymbol;
	/**
	 * 对应图片
	 */
	private String imageName;
	/**
	 * 词性
	 */
	private String type;
	/**
	 * 英文解释
	 */
	private String englishParaphrase;
	/**
	 * 中文解释
	 */
	private String chineseParaphrase;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTimetableId() {
		return timetableId;
	}
	public void setTimetableId(Integer timetableId) {
		this.timetableId = timetableId;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public String getPhoneticSymbol() {
		return phoneticSymbol;
	}
	public void setPhoneticSymbol(String phoneticSymbol) {
		this.phoneticSymbol = phoneticSymbol;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEnglishParaphrase() {
		return englishParaphrase;
	}
	public void setEnglishParaphrase(String englishParaphrase) {
		this.englishParaphrase = englishParaphrase;
	}
	public String getChineseParaphrase() {
		return chineseParaphrase;
	}
	public void setChineseParaphrase(String chineseParaphrase) {
		this.chineseParaphrase = chineseParaphrase;
	}
	
	
	
}
