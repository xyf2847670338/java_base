package com.school;

public class Studengt {
	//����������Ա����
	//private����ɼ��� ��ǰ����ֻ���ڱ����б�����
	//����Ա��������Ϊ˽�еģ�������ķ�װ
	//�ⲿ����Ҫ���������Ա����������ͨ�����е�getter setter����
	String xingming;//�ַ�ת���͵�����
	//û�����η������ɼ��ԣ���ǰ����ֻ���ڱ����б�����
	int chengji;//���εĳɼ�
	//get����ȡ  set������
	//���û�ж����κι��췽����java��������Զ�����һ���޲εĹ��췽��
	//������˴������Ĺ��췽����java������Ὣ�����Զ�����һ���޲εĹ��췽��
	//����ʲô��������������һ���ݲ����Ĺ��췽��
	//�����޲εĹ��췽����
	//���췽����һ������ķ��������η�+����([�������� ������]){}
	public Studengt(String xingming, int chengji) {
		this.xingming = xingming;
		this.chengji = chengji;
		// TODO �Զ����ɵĹ��캯�����
	}
	public String getXinming() {
		return xingming;
	}
	public Studengt() {
		super();
	}
	public void setXinming(String xingming) {
		this.xingming = xingming;
	}
	public int getChengji() {
		return chengji;
	}
	public void setChengji(int chengji) {
		this.chengji = chengji;
	}

}
