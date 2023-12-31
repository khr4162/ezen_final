/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-07-31 04:31:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>info</title>\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/css/info.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"before-load\">\n");
      out.write("   <div class=\"loading\">\n");
      out.write("      <svg class=\"loading-circle\">\n");
      out.write("         <circle cx=\"30%\" cy=\"70%\" r=\"25\"></circle>\n");
      out.write("      </svg>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"container\">\n");
      out.write("      <section class=\"scroll-section\" id=\"scroll-section-0\">\n");
      out.write("         <h1 style=\"color: white;\">Ok Rantal</h1>\n");
      out.write("         <object id=\"svg\" class=\"sticky-elem ok-logo\" data=\"/resources/img/rokoh.svg\" type=\"image/svg+xml\"></object>\n");
      out.write("         <div class=\"sticky-elem main-message a\">\n");
      out.write("            <p style=\"font-size: 4rem;\">Ezen</p>\n");
      out.write("         </div>\n");
      out.write("         <span class=\"sticky-elem ribbon-path\">\n");
      out.write("            <svg id=\"Layer_1\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 700 450\">\n");
      out.write("               <path id=\"path\" class=\"st1\" d=\"M709,41.5c-194,38-387,122-455,159c-64.13,34.89-73.4,42.42,20,26c82.5-14.5,126.34-33.68,185-38 c47.5-3.5,69.22,7.98-11,39c-75,29-251,98-459,169\"></path>\n");
      out.write("            </svg>\n");
      out.write("         </span>\n");
      out.write("         \n");
      out.write("         <div class=\"sticky-elem main-message b\">\n");
      out.write("            <p style=\"color: black; font-size: 4rem;\">Team Project</p>\n");
      out.write("         </div>\n");
      out.write("      </section>\n");
      out.write("      <div class=\"normal-content\">\n");
      out.write("         <section>\n");
      out.write("            <p class=\"mid-message\" style=\"text-align: center;\">\n");
      out.write("\n");
      out.write("                    Welcome to <strong style=\"font-size: 10rem; color: black;\">Ok Rental</strong> <br>\n");
      out.write("                    your ultimate destination for renting top-notch household appliances. Our website is the fruit of labor by the ingenious <br>\n");
      out.write("                    <strong style=\"font-size: 8rem; color: black;\">'Ezen Team Project'</strong>, <br>\n");
      out.write("                     comprising talented individuals - <br>\n");
      out.write("                     <strong style=\"font-size: 7rem; color: black;\"> Cho Hyun Seok <br> Kim Hyeong Rae <br> lee geon ju <br> Song Ji Ho.</strong> <br>\n");
      out.write("					At Ok Rental, we offer exceptional, hassle-free rental services for premium appliances like air conditioners, air purifiers, vacuum cleaners, and rice cookers. Enjoy top-quality products without the burden of heavy investment or maintenance. Our commitment to customer satisfaction sets us apart, making you part of a community that values service, quality, and trust. Visit Ok Rental today to redefine your rental experience!\n");
      out.write("                          \n");
      out.write("                </p>\n");
      out.write("                <!-- \n");
      out.write("                    - 번역 -\n");
      out.write("                    'Ok Rental'에 오신 것을 환영합니다. 최고의 가정용 기기를 대여할 수 있는 여러분의 최고의 목적지입니다. 우리 웹사이트는 김형래, 이건주, 송지호, 조현석 등의 재능 있는 개인들로 구성된 '이젠 팀 프로젝트'의 노력의 결실입니다.\n");
      out.write("\n");
      out.write("                    Ok Rental에서는 여러분의 생활을 간편하게 만들어 줄 수 있는 탁월한 렌탈 서비스를 제공하는 데 신념을 가지고 있습니다. 고성능 에어컨, 세련된 공기청정기, 효율적인 무선청소기, 신뢰할 수 있는 밥솥이 필요하신가요? 저희가 해결해 드립니다!\n");
      out.write("\n");
      out.write("                    우리의 품질 높은 렌탈 아이템들은 고객님의 특별한 필요성과 편의성을 염두에 두고 신중하게 선별됩니다. Ok Rental과 함께라면 비싼 투자나 유지 관리의 부담 없이 프리미엄 가전제품을 즐길 수 있습니다.\n");
      out.write("\n");
      out.write("                    하지만 이것이 전부는 아닙니다. 우리를 다른 회사들과 구별 짓는 것은 고객 만족에 대한 우리의 헌신과 무료로 렌탈하는 과정입니다. Ok Rental을 선택하면, 단순히 제품을 얻는 것이 아니라, 서비스, 품질, 신뢰를 중시하는 커뮤니티의 일원이 됩니다.\n");
      out.write("\n");
      out.write("                    오늘 바로 Ok Rental을 방문하여 여러분의 렌탈 경험을 새롭게 정의하세요!\n");
      out.write("                 -->\n");
      out.write("         </section>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("    <a href=\"/home\" id=\"goToPage\" class=\"go-to-page\"> Enter </a>\n");
      out.write("\n");
      out.write("   <script src=\"/resources/js/info.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
