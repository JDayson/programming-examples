<%@ Page Title="Upload Recipes" Language="vb" MasterPageFile="~/Site.Master" AutoEventWireup="false"
    CodeBehind="Upload.aspx.vb" Inherits="WebApplication2.About" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">
</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
    <h2>
        Upload Recipe
    </h2>
    <p>
     
    Ingredients</p>
    <p>
    <asp:ListBox ID="lstIngredients" runat="server">
    </asp:ListBox>
    </p>
    Add an ingredient: &nbsp &nbsp
<asp:TextBox ID="txtIngredient" runat="server">name</asp:TextBox>
&nbsp; amount
    <asp:TextBox ID="txtAmountWhole" runat="server" Width="41px">0</asp:TextBox>
&nbsp;&amp;
    <asp:DropDownList ID="DropDownList1" runat="server">
        <asp:ListItem>0</asp:ListItem>
        <asp:ListItem>1/8</asp:ListItem>
        <asp:ListItem>1/4</asp:ListItem>
        <asp:ListItem>1/3</asp:ListItem>
        <asp:ListItem>1/2</asp:ListItem>
        <asp:ListItem>2/3</asp:ListItem>
        <asp:ListItem>3/4</asp:ListItem>
    </asp:DropDownList>
    <asp:TextBox ID="txtUnits" runat="server" Width="147px"> enter cup tbls box etc...</asp:TextBox>
    &nbsp &nbsp &nbsp
    <asp:Button ID="btnAddIngredient" runat="server" Text="Add" />
    <br />
    <br />
    Add Instructions:<br />
    <asp:TextBox ID="txtInstructions" runat="server" BorderStyle="Solid" 
        Height="200px" Width="400px"></asp:TextBox>
    <br />
    <asp:Button ID="btnUploadRecipe" runat="server" Text="Upload" />
</asp:Content>
