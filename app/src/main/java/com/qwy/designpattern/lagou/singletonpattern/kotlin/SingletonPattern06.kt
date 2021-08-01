package com.qwy.designpattern.lagou.singletonpattern.kotlin

/**
 * 枚举
 */
enum class SingletonPattern06(val code: Int,  val msg: String)  {
    ERROR_SERVER(500, "服务器异常"),
    BAD_GATEWAY(502, "服务器异常"),
    NOT_SERVER(404, "页面不存在"),
    TOKEN_INVALID(40101, "登录状态失效"),
    ERROR_PROXY_FIDDLER(502, "fiddler代理失败");
}