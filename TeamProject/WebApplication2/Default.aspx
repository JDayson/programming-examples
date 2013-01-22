<%@ Page Title="Home Page" Language="vb" MasterPageFile="~/Site.Master" AutoEventWireup="false"
    CodeBehind="Default.aspx.vb" Inherits="WebApplication2._Default" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">

</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
<h1>Hey What's for Dinner?</h1>
    <p>Search for a Recipe by name or keyword:&nbsp; </p>
    <p>
        <asp:TextBox ID="txtSearch" runat="server"></asp:TextBox><asp:Button ID="btnSearch"
            runat="server" Text="Search" /> </p>
    <asp:ListBox ID="lstSearchResults" runat="server"></asp:ListBox>
</asp:Content>
