UbwSettings.scalaVersionSettings

val a01_error1 = project in (file(".") / "a01-整数加法" / "错误代码1")
val a01_right1 = project in (file(".") / "a01-整数加法" / "正确代码1")
val a02 = project in (file(".") / "a02-二进制后继"  )

val file_a03   = file(".") / "a03-十进制后继"
val a03Codegen = project in (file_a03 / "a03-codegen")
val a03        = project in (file_a03 / "a03-core")
