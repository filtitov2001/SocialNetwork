<#include "parts/security.ftlh">
<#import "parts/common.ftlh" as c>

<@c.page>
    <form role="form" action="/cookies" method="post">
        <div class="form-group">
            <label for="color"> Choose color</label>
            <input id="color" type="color" name="color" value="${color}" />
            <br/>
            <label>Current selected:${color}</label>

        </div>
        <div class="form-group">
            <label>Write language</label>
            <input type="text" name="language" class="form-control"
                   value="${language}" />
            <br/>
            <label>Current selected:${language}</label>

        </div>
        <div class="form-group">
            <label>Select text size</label>
            <input type="range" name="size" min="15" max="25" value="${size}">
            <br/>
            <label style="font-size: ${size}px">Current selected:${size}</label>


        </div>


        <input type="hidden" value="${_csrf.token}" name="_csrf">
        <button type="submit" class="btn btn-info">Submit</button>
    </form>
</@c.page>