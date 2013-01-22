<%@ Page Title="Login" Language="vb" MasterPageFile="~/Site.Master" AutoEventWireup="false"
    CodeBehind="Login.aspx.vb" Inherits="WebApplication2.About" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">
</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
<h2>Log In</h2>
<p>
<b>User Name:</b> <br />
    <asp:TextBox ID="txtUserName" runat="server"></asp:TextBox> <br /><br />
<b>Password:</b> <br />
<asp:TextBox ID="txtPassword" runat="server"></asp:TextBox> 
</p>
    <p>
        <asp:Button ID="btnLogin" runat="server" Text="Log In" />
        <br /><br />
</p>
</asp:Content>
