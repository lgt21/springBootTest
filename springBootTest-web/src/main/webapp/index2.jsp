<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Hello React!</title>
    <script src="https://cdn.bootcss.com/react/15.4.2/react.min.js"></script>
    <script src="https://cdn.bootcss.com/react/15.4.2/react-dom.min.js"></script>
    <script src="https://cdn.bootcss.com/babel-standalone/6.22.1/babel.min.js"></script>

</head>
<body>
<div id="example1">hello, World</div>
<div id="example"></div>
<script type="text/babel">

    ReactDOM.render(
            <h1>Hello, ${data}!</h1>,
        document.getElementById('example')
    );
</script>
<div id="content"></div>
<script src="./build/bundle.js"></script>
</body>
</html>