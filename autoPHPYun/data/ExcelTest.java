package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ExcelTest extends BaseTest {

	@BeforeMethod
	public void test0() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
	}

	// 点击主页左侧的广告框,跳转至手机版PHPYUN介绍页面
	@Test
	public void test1() throws InterruptedException {
		webtest.click("xpath=/html/body/div[11]/div[1]/div[1]/a/img");
		Thread.sleep(2000);
	}

	// 点击关闭主页左侧广告框
	@Test
	public void test2() throws InterruptedException {
		webtest.click("xpath=/html/body/div[11]/div[1]/div[2]/div");
		Thread.sleep(2000);
	}

	// 登录成功
	@Test
	public void test3() throws InterruptedException {
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.type("id=username", "username");
		Thread.sleep(2000);
		webtest.click("id=password2");
		webtest.type("id=password", "password");
		webtest.click("id=sublogin");
		Thread.sleep(2000);
	}

	// 登录失败
	@Test
	public void test4() throws InterruptedException {
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.type("id=username", "username");
		Thread.sleep(2000);
		webtest.click("id=password2");
		webtest.type("id=password", "");
		webtest.click("id=sublogin");
		Thread.sleep(2000);
	}

	// 返回首页
	@Test
	public void test5() throws InterruptedException {
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='返回网站首页>>']");
		Thread.sleep(2000);
	}

	// 注册账号
	@Test
	public void test6() throws InterruptedException {
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='注册账号']");
		Thread.sleep(2000);
		webtest.type("id=username1", "username20");
		webtest.type("id=CheckCode", "1111");
		webtest.type("id=password", "password");
		webtest.type("id=passconfirm", "password");
		webtest.click("id=subreg");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='返回首页']");
		Thread.sleep(2000);
	}

	// 登录-注册账号-直接登录
	@Test
	public void test7() throws InterruptedException {
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='注册账号']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='直接登录>']");
		Thread.sleep(2000);
		webtest.type("id=username", "username");
		Thread.sleep(2000);
		webtest.click("id=password2");
		webtest.type("id=password", "password");
		webtest.click("id=sublogin");
		Thread.sleep(2000);
	}

	// 快速注册成功
	@Test
	public void test8() throws InterruptedException {
		webtest.click("class=tip_bottom_reg");
		Thread.sleep(2000);
		webtest.type("id=username1", "username21");
		Thread.sleep(2000);
		webtest.type("id=CheckCode", "1111");
		Thread.sleep(2000);
		webtest.type("id=password", "password");
		Thread.sleep(2000);
		webtest.type("id=passconfirm", "password");
		Thread.sleep(2000);
		webtest.click("id=subreg");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='返回首页']");
		Thread.sleep(2000);
	}

	// 显示密码
	@Test
	public void test9() throws InterruptedException {
		webtest.click("class=tip_bottom_reg");
		Thread.sleep(2000);
		webtest.type("id=password", "password");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='显示密码']");
		Thread.sleep(2000);
	}

	// 关闭底部广告框
	@Test
	public void test10() throws InterruptedException {
		webtest.click("xpath=/html/body/div[7]/div/div[2]/div/div[2]/a");
		Thread.sleep(2000);
	}

	// 底部链接跳转-关于我们-关于我们
	@Test
	public void test11() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='关于我们']");
		Thread.sleep(2000);
	}

	// 底部链接跳转-关于我们-注册协议
	@Test
	public void test12() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='注册协议']");
		Thread.sleep(2000);
	}

	// 底部链接跳转-网站特色-排行榜
	@Test
	public void test13() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='排行榜']");
		Thread.sleep(2000);
	}

	// 底部链接跳转-网站特色-排行榜-查看公司详情
	@Test
	public void test14() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='排行榜']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='霸王科技有限公司']");
		Thread.sleep(2000);
	}

	// 底部链接跳转-网站特色-求职测评
	@Test
	public void test15() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='求职测评']");
		Thread.sleep(2000);
	}

	// 底部链接跳转-网站特色-订阅服务
	@Test
	public void test16() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='订阅服务']");
		Thread.sleep(2000);
	}

	// 底部链接跳转-咨询反馈-客服中心
	@Test
	public void test17() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='客服中心']");
		Thread.sleep(2000);
	}

	// 底部链接跳转-咨询反馈-常见问题
	@Test
	public void test18() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='常见问题']");
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-修改-修改密码
	@Test
	public void test19() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "王五");
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='修改']");

		webtest.type("name=password", "wangwupassword");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=submit");
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-修改-修改邮箱
	@Test
	public void test20() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "王五");
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='修改']");

		webtest.typeAndClear("name=email", "");
		Thread.sleep(2000);
		webtest.type("name=email", "1518470808@qq.com");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=submit");
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-修改-关闭操作提示
	@Test
	public void test21() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "王五");
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='修改']");

		webtest.click("class=admin_new_tip_close");
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-修改-重置修改
	@Test
	public void test22() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "王五");
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='修改']");

		webtest.typeAndClear("name=username", "");
		Thread.sleep(2000);
		webtest.type("id=username", "张三");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=reset");
		webtest.runJs("window.scrollTo(0,0)");
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-重置密码
	@Test
	public void test23() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "王五");
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='密码']");

		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		Thread.sleep(2000);
	}

	// 后台-会员-企业-企业管理-用户名搜索
	@Test
	public void test24() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		webtest.click("xpath=//span[text()='企业']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "打工人");
		Thread.sleep(2000);
		webtest.click("class=admin_new_bth");
		Thread.sleep(2000);
	}

	// 后台-会员-企业-企业管理-日志
	@Test
	public void test25() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		webtest.click("xpath=//span[text()='企业']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "打工人");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//a[text()='日志']");
		Thread.sleep(2000);
	}

	// 后台-会员-企业-企业管理-更多
	@Test
	public void test26() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		webtest.click("xpath=//span[text()='企业']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "打工人");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//a[text()='更多']");
		Thread.sleep(2000);
	}

	// LOGO跳转
	@Test
	public void test27() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[1]/div/a/img");
		Thread.sleep(2000);
	}

	// banner跳转
	@Test
	public void test28() throws InterruptedException {
		webtest.click("id=test1");
		Thread.sleep(2000);
	}

	// 友情链接-PHPYUN人才系统
	@Test
	public void test29() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='PHPYUN人才系统']");
		Thread.sleep(2000);
	}

	// 友情链接-HR135人才网
	@Test
	public void test30() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='HR135人才网']");
		Thread.sleep(2000);
	}

	// 友情链接-PHPYUN论坛
	@Test
	public void test31() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='PHPYUN论坛']");
		Thread.sleep(2000);
	}

	// 友情链接-申请链接
	@Test
	public void test32() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[6]/div[18]/div[1]/span[2]/a[1]");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.click("id=linktype");
		webtest.click("xpath=//a[text()='文字链接']");
		webtest.type("name=title", "雪梨教育");
		webtest.type("name=url", "http://www.edu2act.cn/");
		webtest.type("id=txt_CheckCode", "1111");
		webtest.click("class=login_button2");
		Thread.sleep(2000);
	}

	// 友情链接-更多
	@Test
	public void test33() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[6]/div[18]/div[1]/span[2]/a[2]");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.click("id=linktype");
		webtest.click("xpath=//a[text()='文字链接']");
		webtest.type("name=title", "雪梨教育");
		webtest.type("name=url", "http://www.edu2act.cn/");
		webtest.type("id=txt_CheckCode", "1111");
		webtest.click("class=login_button2");
		Thread.sleep(2000);
	}

	// 返回顶部(关闭右侧广告框
	@Test
	public void test34() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("css=html body.body_bg div#go-top.go-top a.go");
		Thread.sleep(2000);
	}

	// 意见反馈
	@Test
	public void test35() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("css=html body.body_bg div#go-top.go-top a.feedback");
		Thread.sleep(2000);
	}

	// 意见反馈-二维码
	@Test
	public void test36() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.mouseToElement("css=html body.body_bg div#go-top.go-top a.uc-2vm");
		Thread.sleep(2000);
	}

	// 顶部banner跳转
	@Test
	public void test37() throws InterruptedException {
		webtest.click("id=js_ads_banner_top");
		Thread.sleep(2000);
	}

	// 紧急招聘-查看更多职位
	@Test
	public void test38() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,100)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='查看更多职位>']");
		Thread.sleep(2000);
	}

	// 网站公告-更多
	@Test
	public void test39() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,100)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='更多>>']");
		Thread.sleep(2000);
	}

	// 名企招聘-更多名企
	@Test
	public void test40() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='更多名企 >']");
		Thread.sleep(2000);
	}

	// 名企招聘-热搜职位-更多
	@Test
	public void test41() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,800)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='查看更多>']");
		Thread.sleep(2000);
	}

	// 名企招聘-img跳转
	@Test
	public void test42() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.click("class=layui-this");
		Thread.sleep(2000);
	}

	// 热招职位-更多
	@Test
	public void test43() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='更多职位 >']");
		Thread.sleep(2000);
	}

	// 热招职位-职位详情
	@Test
	public void test44() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,1200)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='电信网络工程师']");
		Thread.sleep(2000);
	}

	// 热招人才-翻页
	@Test
	public void test45() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,2000)");
		Thread.sleep(2000);
		webtest.click("id=btnr");
		Thread.sleep(2000);
	}

	// 后台-用户名搜索
	@Test
	public void test46() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "赵六");
		webtest.click("name=search");
		Thread.sleep(2000);
	}

	// 后台-手机号搜索
	@Test
	public void test47() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.mouseToElement("id=bkeytype");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='手机号']");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "180");
		webtest.click("name=search");
		Thread.sleep(2000);
	}

	// 后台-用户ID搜索
	@Test
	public void test48() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.mouseToElement("id=bkeytype");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='用户ID']");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "18");
		webtest.click("name=search");
		Thread.sleep(2000);
	}

	// 后台-全选
	@Test
	public void test49() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=chkAll2");
		Thread.sleep(2000);
	}

	// 后台-高级搜索
	@Test
	public void test50() throws InterruptedException {
		webtest.open("/admin");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='高级搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='收起更多条件']");
		Thread.sleep(2000);
	}
}
