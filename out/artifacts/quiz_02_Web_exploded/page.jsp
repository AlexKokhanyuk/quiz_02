<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>title</title>
    <link rel="stylesheet" href="styles/styles.css">
    <%--<style>--%>
        <%--.control {--%>
            <%--font-family: arial;--%>
            <%--display: block;--%>
            <%--position: relative;--%>
            <%--padding-left: 30px;--%>
            <%--margin-bottom: 2px;--%>
            <%--padding-top: 3px;--%>
            <%--cursor: pointer;--%>
            <%--font-size: 19px;--%>
        <%--}--%>
        <%--.control input {--%>
            <%--position: absolute;--%>
            <%--z-index: -1;--%>
            <%--opacity: 0;--%>
        <%--}--%>
        <%--.control_indicator {--%>
            <%--position: absolute;--%>
            <%--top: 6px;--%>
            <%--left: 0;--%>
            <%--height: 20px;--%>
            <%--width: 20px;--%>
            <%--background: #e6e6e6;--%>
            <%--border: 0px solid #000000;--%>
        <%--}--%>
        <%--.control-radio .control_indicator {--%>
            <%--border-radius: 50%;--%>
        <%--}--%>

        <%--.control:hover input ~ .control_indicator,--%>
        <%--.control input:focus ~ .control_indicator {--%>
            <%--background: #cccccc;--%>
        <%--}--%>

        <%--.control input:checked ~ .control_indicator {--%>
            <%--background: #2aa1c0;--%>
        <%--}--%>
        <%--.control:hover input:not([disabled]):checked ~ .control_indicator,--%>
        <%--.control input:checked:focus ~ .control_indicator {--%>
            <%--background: #0e6647d;--%>
        <%--}--%>
        <%--.control input:disabled ~ .control_indicator {--%>
            <%--background: #e6e6e6;--%>
            <%--opacity: 0.6;--%>
            <%--pointer-events: none;--%>
        <%--}--%>
        <%--.control_indicator:after {--%>
            <%--box-sizing: unset;--%>
            <%--content: '';--%>
            <%--position: absolute;--%>
            <%--display: none;--%>
        <%--}--%>
        <%--.control input:checked ~ .control_indicator:after {--%>
            <%--display: block;--%>
        <%--}--%>
        <%--.control-radio .control_indicator:after {--%>
            <%--left: 7px;--%>
            <%--top: 7px;--%>
            <%--height: 6px;--%>
            <%--width: 6px;--%>
            <%--border-radius: 50%;--%>
            <%--background: #ffffff;--%>
        <%--}--%>
        <%--.control-radio input:disabled ~ .control_indicator:after {--%>
            <%--background: #7b7b7b;--%>
        <%--}--%>
    <%--</style>--%>

</head>
<body>
<p>Hello, dear ${user.name} ${user.surName} ${user.kittyPet}!</p>

<div class="control-group">
    <label class="control control-radio">
        First radio
        <input type="radio" name="radio" checked="checked" />
        <div class="control_indicator"></div>
    </label>
    <label class="control control-radio">
        Second radio
        <input type="radio" name="radio" />
        <div class="control_indicator"></div>
    </label>
    <label class="control control-radio">
        Disabled
        <input type="radio" name="radio2" disabled="disabled" />
        <div class="control_indicator"></div>
    </label>
    <label class="control control-radio">
        Disabled & checked
        <input type="radio" name="radio2" disabled="disabled" checked="checked" />
        <div class="control_indicator"></div>
    </label>
</div>

</body>
</html>
