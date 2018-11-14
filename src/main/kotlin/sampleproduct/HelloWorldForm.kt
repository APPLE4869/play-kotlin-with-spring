package sampleproduct

// なんとKotlinだとこれだけでgetterとsetterが自動生成される。(contentは自動でprivateになる。)
// varをval(不変)にすると、getterのみ生成され、setterは生成されなくなる。
class HelloWorldForm(var content: String = "")
