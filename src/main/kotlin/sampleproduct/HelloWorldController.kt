package sampleproduct

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class HelloWorldController {

  // @RequestMapping以外にも@GetMappingや@PostMappingなどもあり、
  // それらを利用するとmethodの値を省略できるので、
  // 場合によってはそちらを利用した方がスマートにかける。
  @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
  fun input(model: Model, helloWorldForm: HelloWorldForm): String {
    model.addAttribute("firstTitle", "Hello World")
    model.addAttribute("helloWorldForm", helloWorldForm)
    return "input"
  }

  @RequestMapping(value = "/", method = arrayOf(RequestMethod.POST))
  fun register(model: Model, helloWorldForm: HelloWorldForm): String {
    if (helloWorldForm.content == "") {
      return "redirect:/"
    }

    model.addAttribute("postedValue", helloWorldForm.content)
    return "register"
  }
}
